-- ============================================
-- Module 3: PL/SQL Programming
-- Exercise 3: Stored Procedures
-- ============================================

USE BankDB;

-- ============================================
-- Scenario 1: Deposit money into an account
-- ============================================

DELIMITER //

CREATE PROCEDURE DepositMoney(IN p_AccountID INT, IN p_Amount DECIMAL(10,2))
BEGIN
    UPDATE Accounts
    SET Balance = Balance + p_Amount,
        LastModified = CURDATE()
    WHERE AccountID = p_AccountID;

    INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
    VALUES (FLOOR(RAND() * 100000), p_AccountID, CURDATE(), p_Amount, 'Deposit');
END //

DELIMITER ;

CALL DepositMoney(1, 5000);
SELECT * FROM Accounts WHERE AccountID = 1;
SELECT * FROM Transactions;


-- ============================================
-- Scenario 2: Withdraw money (with balance check)
-- ============================================

DELIMITER //

CREATE PROCEDURE WithdrawMoney(IN p_AccountID INT, IN p_Amount DECIMAL(10,2))
BEGIN
    DECLARE currentBalance DECIMAL(10,2);

    SELECT Balance INTO currentBalance FROM Accounts WHERE AccountID = p_AccountID;

    IF currentBalance >= p_Amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_Amount,
            LastModified = CURDATE()
        WHERE AccountID = p_AccountID;

        INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
        VALUES (FLOOR(RAND() * 100000), p_AccountID, CURDATE(), p_Amount, 'Withdraw');

        SELECT 'Withdrawal successful' AS Message;
    ELSE
        SELECT 'Insufficient balance' AS Message;
    END IF;
END //

DELIMITER ;

CALL WithdrawMoney(2, 2000);
SELECT * FROM Accounts WHERE AccountID = 2;


-- ============================================
-- Scenario 3: Calculate monthly EMI for a loan
-- ============================================

DELIMITER //

CREATE PROCEDURE CalculateEMI(IN p_LoanID INT)
BEGIN
    DECLARE p DECIMAL(10,2);
    DECLARE r DECIMAL(10,4);
    DECLARE n INT;
    DECLARE emi DECIMAL(10,2);

    SELECT LoanAmount, InterestRate / 12 / 100, TIMESTAMPDIFF(MONTH, StartDate, EndDate)
    INTO p, r, n
    FROM Loans
    WHERE LoanID = p_LoanID;

    SET emi = (p * r * POWER(1 + r, n)) / (POWER(1 + r, n) - 1);

    SELECT p_LoanID AS LoanID, ROUND(emi, 2) AS MonthlyEMI;
END //

DELIMITER ;

CALL CalculateEMI(1);