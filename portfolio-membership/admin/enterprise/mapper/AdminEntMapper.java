package ks54team01.admin.enterprise.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ks54team01.admin.enterprise.domain.AdminEntAddContract;
import ks54team01.admin.enterprise.domain.AdminEntDetail;
import ks54team01.admin.enterprise.domain.AdminEntList;

@Mapper
public interface AdminEntMapper {
	
	// 입점업체 계약 등록
	int addContract(AdminEntAddContract adminEntAddContract);
	
	// 거래처 목록 조회
	List<AdminEntList> getEntList();
	
	void updateContractStatusToExpired(String ceoCode);
	void updateContractStatusToActive(String ceoCode);
	
	// 입점업체 상세 조회
	AdminEntDetail getEntDetail(String ceoCode);
	
	// 거래처 검색 조회
	List<AdminEntList> getSearchEnt(@Param("searchKey") String searchKey, @Param("searchValue") String searchValue);
}
