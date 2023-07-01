import IHighlight from "../../interfaces/IHighlight"
import IStock from "../../interfaces/IStock"
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
export const getStockByCode = async () => {
    const response = await http.get<IStock>("/stocks/stock/bbas3")
    return response.data
}