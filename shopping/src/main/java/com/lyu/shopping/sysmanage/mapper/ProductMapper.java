package com.lyu.shopping.sysmanage.mapper;

import java.util.List;

import com.lyu.shopping.sysmanage.dto.ProductDTO;
import com.lyu.shopping.sysmanage.entity.Product;

/**
 * 类描述：商品的mapper接口
 * 类名称：com.lyu.shopping.sysmanage.mapper.ProductMapper
 * @author 曲健磊
 * 2018年3月13日.上午10:06:27
 * @version V1.0
 */
public interface ProductMapper {
	
	/**
	 * 查询符合条件的商品列表
	 * @param product 要查询的商品需满足的条件
	 * @return 满足条件的商品列表
	 */
	List<ProductDTO> listProduct(Product product);
	
	/**
	 * 查询出所有商品的名称
	 * @return 所有商品的名称
	 */
	List<String> listAllProductName();
	
	/**
	 * 更新商品的状态
	 * @param productId 要被更新状态的商品id
	 * @param changeValue 1上架，0下架
	 * @return 受影响的行数，1表示更新成功
	 */
	int updateProductStatus(Long productId, Integer changeValue);
	
}
