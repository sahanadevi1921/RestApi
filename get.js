import React,{ useEffect,useState} from "react";
import './view.css';
import axios from "axios";
function DataBaseView(){
    const [content, addContent]=useState([]);
    useEffect(()=>{

    axios.get('http://localhost:8080/ice').then(function (response) {
    // console.log(response.data);
    addContent(response.data);
    });
    })
    return(
        <div>
            <table>
                <tr>
                    <th>id</th>
                    <th>flavors</th>
                    <th>iceShop</th>
                    <th>price</th>
                    <th>toppings</th>
                </tr>
                {content.map((value)=>(
                    <tr>
                        <td>{value.id}</td>
                        <td>{value.flavors}</td>
                        <td>{value.iceShop}</td>
                        <td>{value.price}</td>
                        <td>{value.toppings}</td>
                    </tr>
                ))}
                    
            </table>
        </div>
    )
}
export default DataBaseView;