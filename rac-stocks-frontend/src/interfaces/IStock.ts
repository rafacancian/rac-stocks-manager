import IValidationError from "./IValidationError"


export default interface IStock {
  id: number
  rank: number
  name: string
  code: string
  currentPrice: number
  dividendYield: string
  valorization12M: string
  earningYield: string
  roe: string
  maximumPrice: string
  upside: number
  upsideFormatted: string
  status: string
  score: number
  description: string
  errors: IValidationError[]
  showErrors: boolean
}