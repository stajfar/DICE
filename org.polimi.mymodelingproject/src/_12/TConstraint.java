/**
 */
package _12;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConstraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TConstraint#getAny <em>Any</em>}</li>
 *   <li>{@link _12.TConstraint#getConstraintType <em>Constraint Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTConstraint()
 * @model extendedMetaData="name='tConstraint' kind='elementOnly'"
 * @generated
 */
public interface TConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see _12._12Package#getTConstraint_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see #setConstraintType(String)
	 * @see _12._12Package#getTConstraint_ConstraintType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='constraintType'"
	 * @generated
	 */
	String getConstraintType();

	/**
	 * Sets the value of the '{@link _12.TConstraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(String value);

} // TConstraint
