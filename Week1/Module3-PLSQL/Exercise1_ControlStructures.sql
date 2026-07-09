-- ============================================
-- Module 3: PL/SQL Programming
-- Exercise 1: Control Structures
-- ============================================

USE BankDB;

-- ============================================
-- Scenario 1: Apply 1% interest discount on loans
-- for customers above 60 years old
-- ============================================

DELIMITER //

CREATE PROCEDURE ApplyLoanDiscount()
BEGIN
    UPDATE Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    SET L.InterestRate = L.InterestRate - (L.InterestRate * 0.01)
    WHERE TIMESTAMPDIFF(YEAR, C.DOB, CURDATE()) > 60;
END //

DELIMITER ;

CALL ApplyLoanDiscount();
SELECT * FROM Loans;


-- ============================================
-- Scenario 2: Mark customers as VIP
-- if their balance is greater than $10,000
-- ============================================

ALTER TABLE Customers ADD COLUMN IsVIP BOOLEAN DEFAULT FALSE;

DELIMITER //

CREATE PROCEDURE MarkVIPCustomers()
BEGIN
    UPDATE Customers
    SET IsVIP = TRUE
    WHERE Balance > 10000;
END //

DELIMITER ;

CALL MarkVIPCustomers();
SELECT CustomerID, Name, Balance, IsVIP FROM Customers;


-- ============================================
-- Scenario 3: Print reminder for loans
-- due within the next 30 days
-- ============================================

DELIMITER //

CREATE PROCEDURE LoanReminders()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE v_CustomerID INT;
    DECLARE v_LoanID INT;
    DECLARE v_EndDate DATE;

    DECLARE cur CURSOR FOR
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO v_LoanID, v_CustomerID, v_EndDate;
        IF done = 1 THEN
            LEAVE read_loop;
        END IF;

        SELECT CONCAT('Reminder: Loan ID ', v_LoanID, ' for Customer ', v_CustomerID,
                       '