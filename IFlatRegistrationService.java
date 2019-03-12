package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.WrongAmountException;


public interface IFlatRegistrationService {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) throws WrongAmountException ;
	ArrayList<Integer> getAllOwnerIds();

}
