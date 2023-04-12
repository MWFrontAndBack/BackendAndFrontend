import logo from './logo.svg';
import './App.css';
import { Routes, Route, } from 'react-router-dom';
import { Home } from './routes/home/home';
import { MusciSection } from './routes/music/musicSection';

function App() {
  return (
    <Routes>
      <Route path='/' element={<Home />} />
      <Route path='/music' element={<MusciSection />}></Route>




    </Routes>
  );
}

export default App;
