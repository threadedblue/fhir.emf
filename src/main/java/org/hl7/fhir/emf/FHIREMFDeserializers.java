package org.hl7.fhir.emf;

import org.emfjson.jackson.databind.deser.EMFDeserializers;
import org.emfjson.jackson.module.EMFModule;
import org.hl7.fhir.BundleType;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;

@Deprecated
public class FHIREMFDeserializers extends EMFDeserializers {

	public FHIREMFDeserializers(EMFModule module) {
		super(module);
	}

	@Override
	public JsonDeserializer<?> findMapLikeDeserializer(MapLikeType type, DeserializationConfig config,
			BeanDescription beanDesc, KeyDeserializer keyDeserializer, TypeDeserializer elementTypeDeserializer,
			JsonDeserializer<?> elementDeserializer) throws JsonMappingException {
		// TODO Auto-generated method stub
		return super.findMapLikeDeserializer(type, config, beanDesc, keyDeserializer, elementTypeDeserializer,
				elementDeserializer);
	}

	@Override
	public JsonDeserializer<?> findEnumDeserializer(Class<?> type, DeserializationConfig config,
			BeanDescription beanDesc) throws JsonMappingException {
		// TODO Auto-generated method stub
		return super.findEnumDeserializer(type, config, beanDesc);
	}

	@Override
	public JsonDeserializer<?> findCollectionDeserializer(CollectionType type, DeserializationConfig config,
			BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer)
			throws JsonMappingException {
		// TODO Auto-generated method stub
		return super.findCollectionDeserializer(type, config, beanDesc, elementTypeDeserializer, elementDeserializer);
	}

	@Override
	public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config,
			BeanDescription beanDesc) throws JsonMappingException {
		if (type.isTypeOrSubTypeOf(BundleType.class)) {
			return new FHIREMFBundleTypeDeserializer();
		}		
		return super.findBeanDeserializer(type, config, beanDesc);
	}

}
