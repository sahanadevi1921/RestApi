import React, { Component } from 'react';
import './CSS/sign_in.css';
class Form extends Component {
    state = { 
        "id":"",
        "Flavors":"",
        "iceShop":"",
        "Toppings":"",
        "price":""
     } 
    render() { 
        return (
            <div id="box">
            <div id="1-partition">
            </div>
            <div id="2-partition">
            <h1 id="signin">REGISTERATION</h1>
                <div id="form">
                    <form>
                        <label>Id</label><br/>
                        <input type="id" id="Id"></input><br/>
                        <label>Flavor</label><br/>
                        <input type="flavor" id="Flavor"></input><br/>
                        <label>IceShop</label><br/>
                        <input type="iceshop" id="IceShop"></input><br/>
                        <label>Toppings</label><br/>
                        <input type="toppings" id="Toppings"></input><br/>           
                        <label>Price</label><br/>
                        <input type="price" id="Price"></input><br/>
                        <center>
                        <button onClick={() => {alert('login is successfully');}}>Submit</button>
                        </center>
                    </form>          
                </div>
            </div>
        </div>  
        );
    }
}
export default Form;
