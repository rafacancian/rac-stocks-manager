import axios from "axios";

export const http = axios.create({
    baseURL: "http://localhost:8080",
    headers: {
        Accept: "application/json",
        Content: "application/json",
        //Access-Control-Allow-Origin: "*",
        //Access-Control-Allow-Methods: 'GET, POST, OPTIONS, PUT, PATCH, DELETE',
        //Access-Control-Allow-Headers: "x-access-token, Origin, X-Requested-With, Content-Type, Accept"
    }
})