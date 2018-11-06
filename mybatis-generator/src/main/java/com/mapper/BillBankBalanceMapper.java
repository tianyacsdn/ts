package com.mapper;

import com.domain.BillBankBalance;
import com.domain.BillBankBalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillBankBalanceMapper {
    long countByExample(BillBankBalanceExample example);

    int deleteByExample(BillBankBalanceExample example);

    int insert(BillBankBalance record);

    int insertSelective(BillBankBalance record);

    List<BillBankBalance> selectByExample(BillBankBalanceExample example);

    int updateByExampleSelective(@Param("record") BillBankBalance record, @Param("example") BillBankBalanceExample example);

    int updateByExample(@Param("record") BillBankBalance record, @Param("example") BillBankBalanceExample example);
}