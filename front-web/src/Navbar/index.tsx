import './style.css'

import {ReactComponent as Logo} from './logo.svg';
import { Link } from 'react-router-dom';

function Navbar() {
    return (
        //Se comporta como uma div
        <nav className="main-navbar">
            <Logo />
            <Link to="/" className="logo-next">DS Delivery</Link>
        </nav>
    )
}

export default Navbar;