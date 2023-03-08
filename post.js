import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {useState } from "react";

//import './style.css';

import axios from 'axios';
export default function FormPropsTextFields() {
  const [id, setId] = useState('');
    const [iceshop, seticeshop] = useState("");
    const [flavor, setflavor] = useState("");
    const [toppings, setToppings] = useState("");
    const [price, setPrice] = useState("");
   
 
    async function save(event)
    {
        event.preventDefault();
    try
        {
         await axios.post('http://localhost:8080/ice',
        {
        
        id:id,
        iceshop:iceshop,
        flavor:flavor,
        toppings:toppings,
        price:price,
       
           });
          alert("YOUR ORDER IS PLACED)");
          
          id("");
          seticeshop("");
          setflavor("");
          setToppings("");
          setPrice("");
          
        
        }
    catch(err)
        {
          alert("Failed:(");
        }
   }
  return (
    <>
     {/* <img src={img} alt=""/> */}
    <div class="form">
    <center>
    <h1>BOOK YOUR FAVOURITE ICECREAMZ</h1>
    <br></br>
    
      <Box
      component="form"
      sx={{
          '& .MuiTextField-root': { m: 1, width: '30ch' },
        }}
        noValidate
        autoComplete="on"
        >
      <div>
        
        <TextField
          id="outlined-password-input"
          label="ID"
          placeholder='Enter your icecream id'
          value={id}
          onChange={(event) =>
            {
              setId(event.target.value);      
            }}
        />
        <br>
        </br>
        <TextField
          id="outlined-password-input"
          label="Iceshop"
          placeholder='Enter your shop'
          value={iceshop}
          onChange={(event) =>
            {
              seticeshop(event.target.value);      
            }}
        />
        <br>
        </br>
        <TextField
          id="outlined-password-input"
          label="flavor"
          placeholder='Enter your flavor'
          value={flavor}
          onChange={(event) =>
            {
              setflavor(event.target.value);      
            }}
          />
          <br>
          </br>

        <TextField
          id="outlined-password-input"
          label="Toppings"
          placeholder='ADD YOUR TOPPINGS'
          value={toppings}
          onChange={(event) =>
            {
              setToppings(event.target.value);      
            }}
        />
        <br>
        </br>
        <TextField
          id="outlined-password-input"
          label="Price"
          placeholder='PRICE OF YOUR ORDER'
          value={price}
          onChange={(event) =>
            {
              setPrice(event.target.value);      
            }}
        />
        <br/>
        <br/>
    <button onClick ={save}>BOOK</button>
    <br/>
            </div>
    </Box>
    
    </center>
    </div>
    </>
  );
}