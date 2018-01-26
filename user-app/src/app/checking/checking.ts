import { DatePipe } from '@angular/common';
export class CheckingData {

  id: number;
  transactionId: string;
  postingDate: string;
  effectiveDate: string;
  transactionType: string;
  amount: number;
  checkNumber: number;
  referenceNumber: string;
  payee: string;
  memo: string;
  extDesc: string;
  transactionCategory: string;
  type: string;
  balance: number;
  category: string;

  constructor(id: number, transactionId: string, postingDate: string, effectiveDate: string, transactionType: string, amount: number,
    checkNumber: number, referenceNumber: string, payee: string, memo: string, extDesc: string, transactionCategory: string,
    type: string, balance: number, category: string) {
    this.id = id;
    this.transactionId = transactionId;
    this.postingDate = postingDate;
    this.effectiveDate = effectiveDate;
    this.transactionType = transactionType;
    this.amount = amount;
    this.checkNumber = checkNumber;
    this.referenceNumber = referenceNumber;
    this.payee = payee;
    this.memo = memo;
    this.extDesc = extDesc;
    this.transactionCategory = transactionCategory;
    this.type = type;
    this.balance = balance;
    this.category = category;
  }
}
