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

type ProductId = {
    id: number;
}

type OrderPayLoad = {
    products: ProductId[]

} & OrderLocationData;
 
export type { Product, OrderLocationData, ProductId, OrderPayLoad }