import axios from "axios";
import { OrderPayLoad } from "./Orders/types";

const API_URL = process.env.REACT_APP_API_URL;
const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAP_BOX;

function fetchProducts() {
    return axios(`${API_URL}/products`)
}

function fetchLocalMapBox(local: string) {
    return axios(`https://api.mapbox.com/geocoding/v5/mapbox.places/${local}.json?access_token=${mapboxToken}`)
}

function saveOrder(payload: OrderPayLoad) {
    return axios.post(`${API_URL}/orders`, payload);
}

export {fetchProducts, fetchLocalMapBox, saveOrder}