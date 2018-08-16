package com.didispace.web.aspect;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service
public class TestServiceImp implements TestService {

	@ServiceLog(operation = "新增用户信息测试操作。。。。。")
	@Override
	public boolean insert(Map<String, Object> params, String id) {
		return false;
	}

	@ServiceLog(operation = "更新用户信息操作....")
	@Override
	public boolean update(String name, String id) {
		return false;
	}

	@ServiceLog(operation = "删除操作。。。。")
	@Override
	public boolean delete(String id) {
		return false;
	}

	@ServiceLog(operation = "异常操作测试", level = LogType.ERROR)
	@Override
	public boolean doError(String id) {
		try {
			@SuppressWarnings("unused")
			int i = 1 / 0;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return false;
	}

}
