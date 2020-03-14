package com.cts.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.dto.IpoDTO;
import com.cts.project.models.IPO;
import com.cts.project.repo.IPORepo;
import com.cts.project.services.IPOServices;

@Service
public class IpoServiceImpl implements IPOServices  {
	
	@Autowired
	IPORepo ipor;

	@Override
	public String insert(IpoDTO ipo) {
		IPO ps = new IPO();
		BeanUtils.copyProperties(ipo, ps);
		ps=ipor.save(ps);
		if(ps!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	@Override
	public IPO getOne(int id) {
		Optional<IPO> ipy = ipor.findById(id);
		IPO pm = ipy.get();
		return pm;
	}

	@Override
	public List<IPO> getAll() {
		return ipor.findAll();
	}

	@Override
	public String alter(IpoDTO ipo) {
		IPO ps = new IPO();
		BeanUtils.copyProperties(ipo, ps);
		ps=ipor.save(ps);
		if(ps!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	@Override
	public void remove(int id) {
		ipor.deleteById(id);
		
	}

}
