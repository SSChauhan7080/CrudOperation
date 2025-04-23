import React, { use, useState } from 'react'

const EmployeeComponent = () => {
    const[firstName, setFirstName]=useState('')
    const[lastName, setLastName]=useState('')
    const[email, setEmail]=useState('')

    function handleFirstname(e){
        setFirstName(e.target.value);
    }
    function handlelastname(e){
        setLastName(e.target.value);
    }
    function handleEmail(e){
        setEmail(e.target.value);
    }
    function saveEmployee(e){
        e.preventDefault();
        const employees={firstName, lastName, email}
        console.log(employees)
    }
  return (
    <div className='container' >
        <div className='row'>
            <div className='card'>
                <h2 className='text-center'>Add Employee</h2>
                <div className='card-body'>
                    <form action="">
                        <div className='form-group mb-2'>
                            <label className='form-label'> First Name</label>
                            <input
                             type="text"
                             placeholder='Enter the First name'
                             name='firstName'
                             value={firstName}
                             className='form-control'
                             onChange={handleFirstname}
                              />

                        </div>
                        <div className='form-group mb-2'>
                            <label className='form-label'> Last Name</label>
                            <input
                             type="text"
                             placeholder='Enter the Last name'
                             name='lasttName'
                             value={lastName}
                             className='form-control'
                             onChange={handlelastname}
                              />

                        </div>
                        <div className='form-group mb-2'>
                            <label className='form-label'> Email</label>
                            <input
                             type="text"
                             placeholder='Enter the Email'
                             name='email'
                             value={email}
                             className='form-control'
                             onChange={handleEmail}
                              />

                        </div>
                        <button className='btn btn-success' onClick={saveEmployee}> Submit</button>
                    </form>

                </div>

            </div>

        </div>

    </div>
  )
}

export default EmployeeComponent