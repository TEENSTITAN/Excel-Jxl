package com.engine100.excel.jxl.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 对应标题的单元格的格式
 * @description</br>
 *
 * @author ZhuChengCheng
 * @github https://github.com/engine100
 * @time 2016年11月30日 - 下午3:28:48
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
public @interface ExcelTitleCellFormat {
	public String titleName();
}