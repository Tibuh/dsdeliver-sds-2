import './style.css'

import {ReactComponent as Logo} from './logo.svg';

function Navbar() {
    return (
        //Se comporta como uma div
        <nav className="main-navbar">
            <Logo />
            <a href="home" className="logo-next">DS Delivery</a>
        </nav>
    )
}

export default Navbar;