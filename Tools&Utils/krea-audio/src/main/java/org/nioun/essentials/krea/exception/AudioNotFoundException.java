package org.nioun.essentials.krea.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND , reason = "video inexistante ")
public class AudioNotFoundException extends RuntimeException {

}
