export default interface IHighlight {
  code: string,
  companyName: string,
  companyNameClean: string,
  companyId: number,
  resultType: number,
  resultPercentageValue: string,
  resultAbsoluteValue: string,
  beforeMarket: string,
  afterMarket: string,
  marketIsClosed: boolean,
  minValue: string,
  maxValue: string,
  volume: string,
  recentEvents: number,
  recentReports: number,
  uRLClear: string
}