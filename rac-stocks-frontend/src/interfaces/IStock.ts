export default interface IStock {
  id: number
  rank: number
  name: string
  currentPrice: number
  dividendYield: string
  valorization12M: string
  maximumValue: string
  upside: string
  status: string
  toggleFunction: (param: any) => void
}