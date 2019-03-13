/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.zeligsoft.domain.omg.corba.dsl.idl.validation;

import com.zeligsoft.domain.omg.corba.dsl.idl.Declarator;
import com.zeligsoft.domain.omg.corba.dsl.idl.IDLComment;
import com.zeligsoft.domain.omg.corba.dsl.idl.TypeSpec;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.zeligsoft.domain.omg.corba.dsl.idl.TypeDeclarator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeDeclaratorValidator {
	boolean validate();

	boolean validateComments(EList<IDLComment> value);
	boolean validateType(TypeSpec value);
	boolean validateDeclarators(EList<Declarator> value);
}