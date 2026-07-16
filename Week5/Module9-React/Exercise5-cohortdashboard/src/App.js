import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails name="DN 5.0 - Java FSE React" startDate="16-Jun-2025" status="ongoing" />
      <CohortDetails name="DN 4.0 - Angular" startDate="01-Jan-2025" status="completed" />
    </div>
  );
}

export default App;