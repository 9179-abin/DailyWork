package com.cts.project.services;

import java.util.List;

import com.cts.project.dto.IpoDTO;
import com.cts.project.models.IPO;

public interface IPOServices {
	public String insert(IpoDTO ipoDTO);
	public IPO getOne(int id);
	public List<IPO> getAll();
	public String alter(IpoDTO ipoDTO);
	public void remove(int id);
}
