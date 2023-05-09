package org.nioun.essentials.focalizer.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.nioun.essentials.focalizer.dto.UserGeoIPDTO;
import org.nioun.essentials.focalizer.model.GeoIP;
import org.nioun.essentials.focalizer.model.User;

@Mapper(componentModel = "spring")
public interface UserGeoIPMapper {
	UserGeoIPMapper  INSTANCE = Mappers.getMapper(UserGeoIPMapper.class);
	
	@Mapping(source="user.id",target="userId")
	UserGeoIPDTO toDTO(User user,GeoIP geoIp);
}


