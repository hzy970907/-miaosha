package tech.tengshe789.miaosha.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.tengshe789.miaosha.upms.entity.SysUserRole;
import tech.tengshe789.miaosha.upms.mapper.SysUserRoleMapper;
import tech.tengshe789.miaosha.upms.service.SysUserRoleService;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author 寻欢·李
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	@Override
	public Boolean deleteByUserId(Integer userId) {
		return baseMapper.deleteByUserId(userId);
	}
}
