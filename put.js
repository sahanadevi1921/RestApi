import * as React from 'react';
// import 'bootstrap/dist/css/bootstrap.css';
import { useState} from 'react';
import axios from 'axios';
import TextField from '@mui/material/TextField';
// import 'bootstrap/dist/css/bootstrap.min.css';
//import './patient.css';

export default function UpdateForm() {
    const [id, setId] = useState('');
    const [iceShop, seticeShop] = useState("");
    const [flavors, setflavors] = useState("");
    const [toppings, setToppings] = useState("");
    const [price, setPrice] = useState("");
   
    async function save(event) {
        event.preventDefault();
        try {
            await axios.put("http://localhost:8080/ice/put",

                { "id":id,
                    iceShop:iceShop,
                    flavors:flavors,
                    toppings:toppings,
                    price:price,

                });
            alert("Icecream details Updation Successfully Completed");
            setId("");
            seticeShop("");
            setflavors("");
            setToppings("");
            setPrice("");
            

        }
        catch (err) {
            alert("User Updation Failed");
        }
    }

    return (
        <div>
           
           <center ><h2>Update The Details</h2></center> 

        <form>
       <center> 
       <TextField required id="outlined-basic" label="id" variant="outlined"
        onChange={(event)=>setId(event.target.value)}/> 
        <br></br><br></br>
        <TextField required id="outlined-basic" label="iceshop" variant="outlined"
        onChange={(event)=>seticeShop(event.target.value)}/> 
        <br></br><br></br>
        <TextField id="outlined-basic" label="toppings" variant="outlined"
        onChange={(event)=>setToppings(event.target.value)}/> 
        <br></br><br></br>
        <TextField required id="outlined-basic" label="flavor" variant="outlined" 
        onChange={(event)=>setflavors(event.target.value)}/>
        <br></br><br></br>
        <TextField required id="outlined-basic" label="price" variant="outlined" 
        onChange={(event)=>setPrice(event.target.value)}/>
        <br></br><br></br>
       
        <br></br>
        <br></br>
        </center>
        <div/>
        <center>
               <center> <button type="submit" class="btn btn-primary" onClick={save}>Update</button></center>
                </center>
        <div/>   
            </form>
            

        </div>
    );
}