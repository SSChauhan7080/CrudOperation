import React, {useEffect, useState} from 'react'
import { listEmployees } from '../Services/EmployeeServices'
import {useNavigate } from 'react-router-dom'

const ListEmployeeeComponent = () => {
    // const dummyData=[
    //     {
    //         "id":1,
    //         "firstName":"Ramesh",
    //         "lastName":"Singh",
    //         "email":"ramesh@98.com"
    //     },
    //     {
    //         "id":2,
    //         "firstName":"Brijesh",
    //         "lastName":"Patel",
    //         "email":"raduah@98.com"
    //     },
    //     {
    //         "id":3,
    //         "firstName":"Piyush",
    //         "lastName":"Yadav",
    //         "email":"PiyushY@98.com"
    //     }
    // ]

   const [employees, setEmployees]= useState([])
   const navigator= useNavigate();
   useEffect(()=>{
    listEmployees().then((response)=>{
        setEmployees(response.data);
    }).catch(error=>{
        console.error(error);
    });
    
   }, [])

   function addNewEmployee(){
    navigator('/add-employee')

   }
  return (
    <div className='container'>
        <h2 className="text-center">List Of Employees:</h2>
        <button className='btn btn-primary mb-2' onClick={addNewEmployee}> Add Employee</button>
        <table className='table table-striped table-bordered'>
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>Employess First Name</th>
                    <th>Employess Last Name</th>
                    <th>Employee email id</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map(employee=>
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>

                        </tr>
                    )
                }
               
            </tbody>
        </table>
    </div>
  )
}

export default ListEmployeeeComponent