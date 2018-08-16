package com.didispace.web.aspect;

import java.util.Map;

public interface TestService {

	public boolean insert(Map<String, Object> params, String id);

	public boolean update(String name, String id);

	public boolean delete(String id);

	public boolean doError(String id);
}