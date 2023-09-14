package in.co.hsbc.onlineEventPlanner.service;

import java.util.List;

import in.co.hsbc.onlineEventPlanner.dao.exception.RecordNotFetchedException;
import in.co.hsbc.onlineEventPlanner.dao.exception.RecordNotSavedException;
import in.co.hsbc.onlineEventPlanner.model.Packagee;
import in.co.hsbc.onlineEventPlanner.model.PlanRequest;
import in.co.hsbc.onlineEventPlanner.model.Quotation;

public interface VendorService {
	// business logic and calling of Dao Methods
	boolean addPackage(Packagee vendorPackage) throws RecordNotSavedException;

	List<PlanRequest> getAllUserPlanRequests() throws RecordNotFetchedException;

	Quotation createQuotation(Quotation quotation) throws RecordNotSavedException;
}
