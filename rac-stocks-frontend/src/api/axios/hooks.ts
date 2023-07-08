import IHighlight from "../../interfaces/IHighlight"
import IStockMethods from "../../interfaces/IStockMethods"
import IStockSimple from "../../interfaces/IStockSimple"
import ITopicHighlight from "../../interfaces/ITopicHighlight"
import { http } from "./http"


export const getTopicsHighlights = async () => {
    const response = await http.get<ITopicHighlight[]>("/highlights/topics")
    return response.data
}

export const getStocksHighlights = async () => {
    const response = await http.get<IHighlight[]>("/highlights/stocks")
    return response.data
}

export const getFIIsHighlights = async () => {
    const response = await http.get<IHighlight[]>("/highlights/fiis")
    return response.data
}

export const getBDRsHighlights = async () => {
    const response = await http.get<IHighlight[]>("/highlights/bdrs")
    return response.data
}

export const getCriptosHighlights = async () => {
    const response = await http.get<IHighlight[]>("/highlights/criptos")
    return response.data
}

{/* Page Stock */}
export const getStockByCode = async (code : String) => {
    return await http.get<IStockMethods>("/stocks/"+code)
    .then(response => {
        return response.data
    }).catch(error => {
        window.alert("[Error] GetStockByCode :" +error)
        return error
    })  
    
}

export const getStockBySegment = async (segment : String) => {
    return await http.get<IStockSimple[]>("/stocks/segment/"+segment)
    .then(response => {
        return response.data;
    })
    .catch(error => {
        window.alert("[Error] GetStockBySegment: " +error)
        return error
    })  
}

export const getStockBySector = async (sector : String) => {
    return await http.get<IStockSimple[]>("/stocks/sector/"+sector)
    .then(response => {
        return response;
    })
    .catch(error => {
        window.alert("[Error] getStockBySector: " +error)
        return error
    })  
}

export const getStocks = async () => {
    const response = await http.get<IStockSimple[]>("/stocks/all/relevant")
    return response.data
}