import IMethod from "./IMethod"

export default interface IStockMethods {
  name: string
  code: string
  currentValue: string
  dividendYield: string
  valorization12M: string
  graham : IMethod,
  bazin: IMethod,
  wacc : IMethod,
  barsi : IMethod
}