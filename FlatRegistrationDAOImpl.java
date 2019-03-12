package com.cg.frs.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.ownerdto.OwnerDetails;
public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO{
	HashMap<Integer, OwnerDetails> mapEntry;
	HashMap<Integer,FlatRegistrationDTO>registerEntry;
	static int regno=1000;
	public FlatRegistrationDAOImpl() {
		mapEntry=new HashMap<Integer, OwnerDetails>();
		mapEntry.put(1,new OwnerDetails("Vaishali Srivastava","8888108810"));
		mapEntry.put(2,new OwnerDetails("Ankitha Ghokhle","9876665454"));
		mapEntry.put(3,new OwnerDetails("Vaishali Srivastava","7659993201"));
	}
   public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
	registerEntry=new HashMap<Integer, FlatRegistrationDTO>();
    int ownerId=flat.getOwnerId();
	int flatType=flat.getFlatType();
	int flatArea=flat.getFlatArea();         
	int depositAmount=flat.getDepositAmount(); 
	int rentAmount=flat.getRentAmount();
	flat.setFlatRegNo(regno);
	for(Entry<Integer, FlatRegistrationDTO> m: registerEntry.entrySet()) {
		flat=registerEntry.put(regno,new FlatRegistrationDTO(regno,ownerId,flatType,flatArea,depositAmount,rentAmount));
	}
		regno++;
	return flat;
	
}
	
		

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(Entry<Integer, OwnerDetails> m: mapEntry.entrySet()) {
		list.add((Integer) m.getKey());
	
		
	}
		return list;


}
}
