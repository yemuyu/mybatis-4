package mytest.part1;

import org.apache.ibatis.annotations.Param;

/**
 * Created by liufq on 10/1/18.
 */
public interface XyParamInfoDao {
        XyParamInfo getByPrimaryKey(@Param("param_type") String paramType, @Param("param_key") String paramKey);
    }

