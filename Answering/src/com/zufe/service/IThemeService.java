package com.zufe.service;

import java.util.List;

import com.zufe.model.*;
import com.zufe.util.*;

/**
 * 主题业务层接口
 */
public interface IThemeService {
	int add(Theme theme);

	int delete(int theid);

	List getAll();

	Page query(String key, Page page);
}
