interface Product {
    id: number,
    name: string,
    price: number,
    descripition: string,
    imageUri: string
}

interface OrderLocationData {
    latitude: number;
    longitude: number;
    address: string
}

export type { Product, OrderLocationData }