import './App.css'
import EmployeeComponent from './Component/EmployeeComponent'
import FooterComponent from './Component/FooterComponent'
import HeaderComponent from './Component/HeaderComponent'
import ListEmployeeeComponent from './Component/ListEmployeeeComponent'
import{BrowserRouter, Route, Routes} from 'react-router-dom'

function App() {


  return (
    <>
    <BrowserRouter>
      <HeaderComponent/>
      <Routes>
        <Route path='/' element={<ListEmployeeeComponent/>}> </Route>
        <Route path='/employees' element={<ListEmployeeeComponent/>}> </Route>
        <Route path='/add-employee' element={EmployeeComponent}></Route>

      </Routes>
      {/* <ListEmployeeeComponent/> */}
      <FooterComponent/>
    </BrowserRouter>
  
    </>
  )
}

export default App
