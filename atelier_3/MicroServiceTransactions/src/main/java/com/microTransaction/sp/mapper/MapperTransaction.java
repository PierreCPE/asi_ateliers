package com.microTransaction.sp.mapper;

import com.microTransaction.sp.model.*;

public class MapperTransaction {
	
	public static Transaction TransactionDTOtoTransaction(TransactionDTO transactionDTO, int idVendeur, int price) {
		Transaction transaction = new Transaction();
		transaction.setIdCard(transactionDTO.getIdcard());
		transaction.setIdAcheteur(transactionDTO.getIduser());
		transaction.setIdVendeur(idVendeur);
		transaction.setPrice(price);
		return transaction;
	}
	
	public static TransactionDTO TransactiontoTransactionDTO(Transaction transaction) {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setIdcard(transaction.getIdCard());
		transactionDTO.setIduser(transaction.getIdVendeur());
		return transactionDTO;
	}
	
}
