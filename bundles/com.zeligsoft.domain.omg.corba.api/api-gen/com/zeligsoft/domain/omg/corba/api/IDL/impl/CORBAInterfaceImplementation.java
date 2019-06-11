package com.zeligsoft.domain.omg.corba.api.IDL.impl;

import com.zeligsoft.base.zdl.staticapi.util.ZDLFactoryRegistry;

import com.zeligsoft.domain.omg.corba.api.IDL.CORBAInterface;
import com.zeligsoft.domain.zml.api.ZML_Component.impl.InterfaceImplementation;

import com.zeligsoft.domain.omg.corba.api.IDL.CORBAClassifierContained;
import com.zeligsoft.domain.omg.corba.api.IDL.CORBAConstant;
import com.zeligsoft.domain.omg.corba.api.IDL.CORBAAttribute;
import com.zeligsoft.domain.omg.corba.api.IDL.CORBAOperation;

import com.zeligsoft.base.zdl.util.ZDLUtil;

public class CORBAInterfaceImplementation extends InterfaceImplementation
		implements CORBAInterface {
	protected java.util.List<CORBAConstant> _ownedConstants;
	protected java.util.List<CORBAInterface> _generals;
	protected java.util.List<CORBAClassifierContained> _contents;
	protected java.util.List<CORBAAttribute> _ownedAttribute;
	protected java.util.List<CORBAOperation> _ownedOperation;

	public CORBAInterfaceImplementation(org.eclipse.emf.ecore.EObject element) {
		super(element);
	}

	@Override
	public java.util.List<CORBAConstant> getOwnedConstants() {
		if (_ownedConstants == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "CORBADomain::IDL::CORBAClassifier",
							"ownedConstants");
			_ownedConstants = new java.util.ArrayList<CORBAConstant>();
			@SuppressWarnings("unchecked")
			final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
			for (Object next : rawList) {
				if (next instanceof org.eclipse.emf.ecore.EObject) {
					CORBAConstant nextWrapper = ZDLFactoryRegistry.INSTANCE
							.create((org.eclipse.emf.ecore.EObject) next,
									CORBAConstant.class);
					_ownedConstants.add(nextWrapper);
				}
			}
		}
		return _ownedConstants;
	}

	@Override
	public void addOwnedConstants(CORBAConstant val) {
		// make sure the ownedConstants list is created
		getOwnedConstants();

		final Object rawValue = ZDLUtil.getValue(element,
				"CORBADomain::IDL::CORBAClassifier", "ownedConstants");
		@SuppressWarnings("unchecked")
		final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
		rawList.add(val.eObject());
		if (_ownedConstants != null) {
			_ownedConstants.add(val);
		}
	}

	@Override
	public <T extends CORBAConstant> T addOwnedConstants(Class<T> typeToCreate,
			String concept) {
		// make sure the ownedConstants list is created
		getOwnedConstants();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedConstants",
				concept);
		T element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept, typeToCreate);
		if (_ownedConstants != null) {
			_ownedConstants.add(element);
		}
		return element;
	}

	@Override
	public CORBAConstant addOwnedConstants() {
		// make sure the ownedConstants list is created
		getOwnedConstants();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedConstants",
				"CORBADomain::IDL::CORBAConstant");
		CORBAConstant element = ZDLFactoryRegistry.INSTANCE
				.create(newConcept,
						CORBAConstant.class);
		if (_ownedConstants != null) {
			_ownedConstants.add(element);
		}
		return element;
	}

	@Override
	public java.util.List<CORBAInterface> getGenerals() {
		if (_generals == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "CORBADomain::IDL::CORBAInterface",
							"generals");
			_generals = new java.util.ArrayList<CORBAInterface>();
			@SuppressWarnings("unchecked")
			final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
			for (Object next : rawList) {
				if (next instanceof org.eclipse.emf.ecore.EObject) {
					CORBAInterface nextWrapper = ZDLFactoryRegistry.INSTANCE
							.create((org.eclipse.emf.ecore.EObject) next,
									CORBAInterface.class);
					_generals.add(nextWrapper);
				}
			}
		}
		return _generals;
	}

	@Override
	public void addGenerals(CORBAInterface val) {
		// make sure the generals list is created
		getGenerals();

		final Object rawValue = ZDLUtil.getValue(element,
				"CORBADomain::IDL::CORBAInterface", "generals");
		@SuppressWarnings("unchecked")
		final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
		rawList.add(val.eObject());
		if (_generals != null) {
			_generals.add(val);
		}
	}

	@Override
	public java.util.List<CORBAClassifierContained> getContents() {
		if (_contents == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "CORBADomain::IDL::CORBAClassifier",
							"contents");
			_contents = new java.util.ArrayList<CORBAClassifierContained>();
			@SuppressWarnings("unchecked")
			final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
			for (Object next : rawList) {
				if (next instanceof org.eclipse.emf.ecore.EObject) {
					CORBAClassifierContained nextWrapper = ZDLFactoryRegistry.INSTANCE
							.create((org.eclipse.emf.ecore.EObject) next,
									CORBAClassifierContained.class);
					_contents.add(nextWrapper);
				}
			}
		}
		return _contents;
	}

	@Override
	public void addContents(CORBAClassifierContained val) {
		// make sure the contents list is created
		getContents();

		final Object rawValue = ZDLUtil.getValue(element,
				"CORBADomain::IDL::CORBAClassifier", "contents");
		@SuppressWarnings("unchecked")
		final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
		rawList.add(val.eObject());
		if (_contents != null) {
			_contents.add(val);
		}
	}

	@Override
	public <T extends CORBAClassifierContained> T addContents(
			Class<T> typeToCreate, String concept) {
		// make sure the contents list is created
		getContents();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "contents",
				concept);
		T element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept, typeToCreate);
		if (_contents != null) {
			_contents.add(element);
		}
		return element;
	}

	@Override
	public String getQualifiedName() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::NamedElement", "qualifiedName");
		return (String) rawValue;
	}

	@Override
	public String getName() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::NamedElement", "name");
		return (String) rawValue;
	}

	@Override
	public void setName(String val) {
		ZDLUtil.setValue(element, "ZMLMM::ZML_Core::NamedElement", "name", val);
	}

	@Override
	public java.util.List<CORBAAttribute> getOwnedAttribute() {
		if (_ownedAttribute == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "CORBADomain::IDL::CORBAClassifier",
							"ownedAttribute");
			_ownedAttribute = new java.util.ArrayList<CORBAAttribute>();
			@SuppressWarnings("unchecked")
			final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
			for (Object next : rawList) {
				if (next instanceof org.eclipse.emf.ecore.EObject) {
					CORBAAttribute nextWrapper = ZDLFactoryRegistry.INSTANCE
							.create((org.eclipse.emf.ecore.EObject) next,
									CORBAAttribute.class);
					_ownedAttribute.add(nextWrapper);
				}
			}
		}
		return _ownedAttribute;
	}

	@Override
	public void addOwnedAttribute(CORBAAttribute val) {
		// make sure the ownedAttribute list is created
		getOwnedAttribute();

		final Object rawValue = ZDLUtil.getValue(element,
				"CORBADomain::IDL::CORBAClassifier", "ownedAttribute");
		@SuppressWarnings("unchecked")
		final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
		rawList.add(val.eObject());
		if (_ownedAttribute != null) {
			_ownedAttribute.add(val);
		}
	}

	@Override
	public <T extends CORBAAttribute> T addOwnedAttribute(
			Class<T> typeToCreate, String concept) {
		// make sure the ownedAttribute list is created
		getOwnedAttribute();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedAttribute",
				concept);
		T element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept, typeToCreate);
		if (_ownedAttribute != null) {
			_ownedAttribute.add(element);
		}
		return element;
	}

	@Override
	public CORBAAttribute addOwnedAttribute() {
		// make sure the ownedAttribute list is created
		getOwnedAttribute();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedAttribute",
				"CORBADomain::IDL::CORBAAttribute");
		CORBAAttribute element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept,
				CORBAAttribute.class);
		if (_ownedAttribute != null) {
			_ownedAttribute.add(element);
		}
		return element;
	}

	@Override
	public Boolean getIsAbstract() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "CORBADomain::IDL::CORBAInterface", "isAbstract");
		return (Boolean) rawValue;
	}

	@Override
	public void setIsAbstract(Boolean val) {
		ZDLUtil.setValue(element, "CORBADomain::IDL::CORBAInterface",
				"isAbstract", val);
	}

	@Override
	public java.util.List<CORBAOperation> getOwnedOperation() {
		if (_ownedOperation == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "CORBADomain::IDL::CORBAClassifier",
							"ownedOperation");
			_ownedOperation = new java.util.ArrayList<CORBAOperation>();
			@SuppressWarnings("unchecked")
			final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
			for (Object next : rawList) {
				if (next instanceof org.eclipse.emf.ecore.EObject) {
					CORBAOperation nextWrapper = ZDLFactoryRegistry.INSTANCE
							.create((org.eclipse.emf.ecore.EObject) next,
									CORBAOperation.class);
					_ownedOperation.add(nextWrapper);
				}
			}
		}
		return _ownedOperation;
	}

	@Override
	public void addOwnedOperation(CORBAOperation val) {
		// make sure the ownedOperation list is created
		getOwnedOperation();

		final Object rawValue = ZDLUtil.getValue(element,
				"CORBADomain::IDL::CORBAClassifier", "ownedOperation");
		@SuppressWarnings("unchecked")
		final java.util.List<Object> rawList = (java.util.List<Object>) rawValue;
		rawList.add(val.eObject());
		if (_ownedOperation != null) {
			_ownedOperation.add(val);
		}
	}

	@Override
	public <T extends CORBAOperation> T addOwnedOperation(
			Class<T> typeToCreate, String concept) {
		// make sure the ownedOperation list is created
		getOwnedOperation();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedOperation",
				concept);
		T element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept, typeToCreate);
		if (_ownedOperation != null) {
			_ownedOperation.add(element);
		}
		return element;
	}

	@Override
	public CORBAOperation addOwnedOperation() {
		// make sure the ownedOperation list is created
		getOwnedOperation();
		org.eclipse.emf.ecore.EObject newConcept = ZDLUtil.createZDLConcept(
				element, "CORBADomain::IDL::CORBAClassifier", "ownedOperation",
				"CORBADomain::IDL::CORBAOperation");
		CORBAOperation element = ZDLFactoryRegistry.INSTANCE.create(
				newConcept,
				CORBAOperation.class);
		if (_ownedOperation != null) {
			_ownedOperation.add(element);
		}
		return element;
	}

	@Override
	public String getUuid() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Component::WorkerFunctionIdentifiable",
				"uuid");
		return (String) rawValue;
	}

	@Override
	public void setUuid(String val) {
		ZDLUtil.setValue(element,
				"ZMLMM::ZML_Component::WorkerFunctionIdentifiable", "uuid", val);
	}

	@Override
	public Boolean getIsLocal() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "CORBADomain::IDL::CORBAInterface", "isLocal");
		return (Boolean) rawValue;
	}

	@Override
	public void setIsLocal(Boolean val) {
		ZDLUtil.setValue(element, "CORBADomain::IDL::CORBAInterface",
				"isLocal", val);
	}

	@Override
	public Boolean getIsAsynchronous() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
				.getValue(eObject(), "CORBADomain::IDL::CORBAInterface",
						"isAsynchronous");
		return (Boolean) rawValue;
	}

	@Override
	public void setIsAsynchronous(Boolean val) {
		ZDLUtil.setValue(element, "CORBADomain::IDL::CORBAInterface",
				"isAsynchronous", val);
	}

	@Override
	public org.eclipse.uml2.uml.Interface asInterface() {
		return (org.eclipse.uml2.uml.Interface) eObject();
	}

	@Override
	public org.eclipse.uml2.uml.NamedElement asNamedElement() {
		return (org.eclipse.uml2.uml.NamedElement) eObject();
	}
}
