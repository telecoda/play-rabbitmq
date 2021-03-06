/** 
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Felipe Oliveira (http://mashup.fm)
 * 
 */
package play.modules.rabbitmq.exception;

/**
 * The Class RabbitMQRetriableException.
 */
public class RabbitMQRetriableException extends RuntimeException {

	/**
	 * Instantiates a new rabbit mq not retriable exception.
	 */
	public RabbitMQRetriableException() {
		super();
	}

	/**
	 * Instantiates a new rabbit mq not retriable exception.
	 * 
	 * @param msg
	 *            the msg
	 */
	public RabbitMQRetriableException(String msg) {
		super(msg);
	}

}
