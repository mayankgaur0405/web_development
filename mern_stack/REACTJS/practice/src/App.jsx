
import './App.css'
import Counter from './Counter/Counter'
import Footer from './Footer/Footer'
import Header from './Header/Header'
import MainContent from './MainContent/MainContent'


function App() {
  
  const handleClick = () =>{
    alert("Button clicked!");
  }
  return (
    <>
     <Header/>
     <MainContent/>
     <Footer/>

     <button onClick={handleClick}>Click me</button>

     <Counter/>

     
    </>
  )
}

export default App
