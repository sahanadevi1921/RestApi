// import React from 'react';
// import ReactDOM from 'react-dom/client';
// import RegistrationForm from './components/sample';
// //import App from './components/App';
// //import FormPropsTextFields from './components/post';
// //import Demo from './components/sample';
// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//   <React.StrictMode>
//     <RegistrationForm/>
//   </React.StrictMode>
// );          

import React from 'react';
import ReactDOM from 'react-dom/client'; 
import FormPropsTextFields from './component/post';
import Deleteform from './component/delete';
import UpdateForm from './component/put';
import DataBaseView from './component/get';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
  <Deleteform/>
    < UpdateForm/>
    <DataBaseView />
    <FormPropsTextFields/>
  </React.StrictMode>
);


