import IValidationError from "./IValidationError"

export default interface IMethod {
  isValid: boolean
  description: string
  maximumPrice: string
  upside: number
  upsideFormatted: string
  errors: IValidationError[]
}