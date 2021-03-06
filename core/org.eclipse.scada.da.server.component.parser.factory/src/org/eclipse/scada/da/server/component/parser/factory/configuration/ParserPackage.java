/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 */
package org.eclipse.scada.da.server.component.parser.factory.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ParserFactory
 * @model kind="package"
 * @generated
 */
public interface ParserPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "configuration"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://eclipse.org/SCADA/DA/Server/Parser"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "parser"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ParserPackage eINSTANCE = org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ComponentImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ID = 0;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__INPUT = 1;

    /**
     * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__EXTRACTORS = 2;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition <em>Input Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getInputDefinition()
     * @generated
     */
    int INPUT_DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DEFINITION__TRANSFORMERS = 0;

    /**
     * The number of structural features of the '<em>Input Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DEFINITION_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DEFINITION___CREATE_INPUT__CREATIONCONTEXT = 0;

    /**
     * The number of operations of the '<em>Input Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DEFINITION_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractInputImpl <em>Abstract Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractInputImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAbstractInput()
     * @generated
     */
    int ABSTRACT_INPUT = 18;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INPUT__TRANSFORMERS = INPUT_DEFINITION__TRANSFORMERS;

    /**
     * The number of structural features of the '<em>Abstract Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INPUT_FEATURE_COUNT = INPUT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INPUT___CREATE_INPUT__CREATIONCONTEXT = INPUT_DEFINITION___CREATE_INPUT__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Abstract Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INPUT_OPERATION_COUNT = INPUT_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractPeriodInputImpl <em>Abstract Period Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractPeriodInputImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAbstractPeriodInput()
     * @generated
     */
    int ABSTRACT_PERIOD_INPUT = 5;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PERIOD_INPUT__TRANSFORMERS = ABSTRACT_INPUT__TRANSFORMERS;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PERIOD_INPUT__PERIOD = ABSTRACT_INPUT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Period Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PERIOD_INPUT_FEATURE_COUNT = ABSTRACT_INPUT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PERIOD_INPUT___CREATE_INPUT__CREATIONCONTEXT = ABSTRACT_INPUT___CREATE_INPUT__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Abstract Period Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PERIOD_INPUT_OPERATION_COUNT = ABSTRACT_INPUT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FileInputImpl <em>File Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FileInputImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getFileInput()
     * @generated
     */
    int FILE_INPUT = 2;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT__TRANSFORMERS = ABSTRACT_PERIOD_INPUT__TRANSFORMERS;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT__PERIOD = ABSTRACT_PERIOD_INPUT__PERIOD;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT__FILE_NAME = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>File Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT_FEATURE_COUNT = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT___CREATE_INPUT__CREATIONCONTEXT = ABSTRACT_PERIOD_INPUT___CREATE_INPUT__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>File Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_INPUT_OPERATION_COUNT = ABSTRACT_PERIOD_INPUT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition <em>Extractor Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getExtractorDefinition()
     * @generated
     */
    int EXTRACTOR_DEFINITION = 3;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRACTOR_DEFINITION__PREFIX = 0;

    /**
     * The number of structural features of the '<em>Extractor Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRACTOR_DEFINITION_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>Create Extractor</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRACTOR_DEFINITION___CREATE_EXTRACTOR__CREATIONCONTEXT = 0;

    /**
     * The number of operations of the '<em>Extractor Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTRACTOR_DEFINITION_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.PlainTextImpl <em>Plain Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.PlainTextImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getPlainText()
     * @generated
     */
    int PLAIN_TEXT = 4;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT__PREFIX = EXTRACTOR_DEFINITION__PREFIX;

    /**
     * The feature id for the '<em><b>Trim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT__TRIM = EXTRACTOR_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Converter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT__VALUE_CONVERTER = EXTRACTOR_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Plain Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT_FEATURE_COUNT = EXTRACTOR_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Create Extractor</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT___CREATE_EXTRACTOR__CREATIONCONTEXT = EXTRACTOR_DEFINITION___CREATE_EXTRACTOR__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Plain Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAIN_TEXT_OPERATION_COUNT = EXTRACTOR_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.UrlInputImpl <em>Url Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.UrlInputImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getUrlInput()
     * @generated
     */
    int URL_INPUT = 6;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT__TRANSFORMERS = ABSTRACT_PERIOD_INPUT__TRANSFORMERS;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT__PERIOD = ABSTRACT_PERIOD_INPUT__PERIOD;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT__URL = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Probe Character Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT__PROBE_CHARACTER_SET = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT__CHARSET = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Url Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT_FEATURE_COUNT = ABSTRACT_PERIOD_INPUT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT___CREATE_INPUT__CREATIONCONTEXT = ABSTRACT_PERIOD_INPUT___CREATE_INPUT__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Url Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int URL_INPUT_OPERATION_COUNT = ABSTRACT_PERIOD_INPUT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SinglePatternImpl <em>Single Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SinglePatternImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getSinglePattern()
     * @generated
     */
    int SINGLE_PATTERN = 7;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN__PREFIX = EXTRACTOR_DEFINITION__PREFIX;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN__PATTERN = EXTRACTOR_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Full Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN__FULL_MATCH = EXTRACTOR_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN__VALUE = EXTRACTOR_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Single Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN_FEATURE_COUNT = EXTRACTOR_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Create Extractor</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN___CREATE_EXTRACTOR__CREATIONCONTEXT = EXTRACTOR_DEFINITION___CREATE_EXTRACTOR__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Single Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_PATTERN_OPERATION_COUNT = EXTRACTOR_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ValueDescriptorImpl <em>Value Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ValueDescriptorImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueDescriptor()
     * @generated
     */
    int VALUE_DESCRIPTOR = 8;

    /**
     * The feature id for the '<em><b>Primary Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DESCRIPTOR__PRIMARY_VALUE = 0;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DESCRIPTOR__ATTRIBUTES = 1;

    /**
     * The number of structural features of the '<em>Value Descriptor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DESCRIPTOR_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Value Descriptor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DESCRIPTOR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FieldImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getField()
     * @generated
     */
    int FIELD = 9;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__TYPE = 0;

    /**
     * The number of structural features of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AttributeValueImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAttributeValue()
     * @generated
     */
    int ATTRIBUTE_VALUE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE__NAME = 0;

    /**
     * The feature id for the '<em><b>Field</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE__FIELD = 1;

    /**
     * The number of structural features of the '<em>Attribute Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Attribute Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MainGroupFieldImpl <em>Main Group Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MainGroupFieldImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getMainGroupField()
     * @generated
     */
    int MAIN_GROUP_FIELD = 11;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_GROUP_FIELD__TYPE = FIELD__TYPE;

    /**
     * The number of structural features of the '<em>Main Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_GROUP_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Main Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_GROUP_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringGroupFieldImpl <em>String Group Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringGroupFieldImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getStringGroupField()
     * @generated
     */
    int STRING_GROUP_FIELD = 12;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_GROUP_FIELD__TYPE = FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Group Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_GROUP_FIELD__GROUP_NAME = FIELD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_GROUP_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>String Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_GROUP_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.NumericGroupFieldImpl <em>Numeric Group Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.NumericGroupFieldImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getNumericGroupField()
     * @generated
     */
    int NUMERIC_GROUP_FIELD = 13;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_GROUP_FIELD__TYPE = FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Group Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_GROUP_FIELD__GROUP_NUMBER = FIELD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Numeric Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_GROUP_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Numeric Group Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_GROUP_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SplitTableImpl <em>Split Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SplitTableImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getSplitTable()
     * @generated
     */
    int SPLIT_TABLE = 14;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__PREFIX = EXTRACTOR_DEFINITION__PREFIX;

    /**
     * The feature id for the '<em><b>Line Separator Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__LINE_SEPARATOR_PATTERN = EXTRACTOR_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Field Separator Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__FIELD_SEPARATOR_PATTERN = EXTRACTOR_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__ID_COLUMN = EXTRACTOR_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fields</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__FIELDS = EXTRACTOR_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Value Converter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE__VALUE_CONVERTER = EXTRACTOR_DEFINITION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Split Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE_FEATURE_COUNT = EXTRACTOR_DEFINITION_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Create Extractor</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE___CREATE_EXTRACTOR__CREATIONCONTEXT = EXTRACTOR_DEFINITION___CREATE_EXTRACTOR__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Split Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPLIT_TABLE_OPERATION_COUNT = EXTRACTOR_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition <em>Transformer Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getTransformerDefinition()
     * @generated
     */
    int TRANSFORMER_DEFINITION = 15;

    /**
     * The number of structural features of the '<em>Transformer Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_DEFINITION_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Create Transformer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_DEFINITION___CREATE_TRANSFORMER__CREATIONCONTEXT = 0;

    /**
     * The number of operations of the '<em>Transformer Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_DEFINITION_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringTransformerImpl <em>String Transformer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringTransformerImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getStringTransformer()
     * @generated
     */
    int STRING_TRANSFORMER = 16;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TRANSFORMER__CHARSET = TRANSFORMER_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Transformer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TRANSFORMER_FEATURE_COUNT = TRANSFORMER_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Create Transformer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TRANSFORMER___CREATE_TRANSFORMER__CREATIONCONTEXT = TRANSFORMER_DEFINITION___CREATE_TRANSFORMER__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>String Transformer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TRANSFORMER_OPERATION_COUNT = TRANSFORMER_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MqttInputImpl <em>Mqtt Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MqttInputImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getMqttInput()
     * @generated
     */
    int MQTT_INPUT = 17;

    /**
     * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT__TRANSFORMERS = ABSTRACT_INPUT__TRANSFORMERS;

    /**
     * The feature id for the '<em><b>Server Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT__SERVER_URI = ABSTRACT_INPUT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT__CLIENT_ID = ABSTRACT_INPUT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT__TOPIC = ABSTRACT_INPUT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT__QOS = ABSTRACT_INPUT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Mqtt Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT_FEATURE_COUNT = ABSTRACT_INPUT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Create Input</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT___CREATE_INPUT__CREATIONCONTEXT = ABSTRACT_INPUT___CREATE_INPUT__CREATIONCONTEXT;

    /**
     * The number of operations of the '<em>Mqtt Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MQTT_INPUT_OPERATION_COUNT = ABSTRACT_INPUT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition <em>Value Converter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueConverterDefinition()
     * @generated
     */
    int VALUE_CONVERTER_DEFINITION = 19;

    /**
     * The number of structural features of the '<em>Value Converter Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CONVERTER_DEFINITION_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Create Converter</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER = 0;

    /**
     * The number of operations of the '<em>Value Converter Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CONVERTER_DEFINITION_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanValueConverterImpl <em>Boolean Value Converter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanValueConverterImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getBooleanValueConverter()
     * @generated
     */
    int BOOLEAN_VALUE_CONVERTER = 20;

    /**
     * The number of structural features of the '<em>Boolean Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_VALUE_CONVERTER_FEATURE_COUNT = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Create Converter</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_VALUE_CONVERTER___CREATE_CONVERTER = VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER;

    /**
     * The number of operations of the '<em>Boolean Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_VALUE_CONVERTER_OPERATION_COUNT = VALUE_CONVERTER_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DefaultValueConverterImpl <em>Default Value Converter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DefaultValueConverterImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getDefaultValueConverter()
     * @generated
     */
    int DEFAULT_VALUE_CONVERTER = 21;

    /**
     * The number of structural features of the '<em>Default Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_CONVERTER_FEATURE_COUNT = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Create Converter</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_CONVERTER___CREATE_CONVERTER = VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER;

    /**
     * The number of operations of the '<em>Default Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_CONVERTER_OPERATION_COUNT = VALUE_CONVERTER_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DoubleValueConverterImpl <em>Double Value Converter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DoubleValueConverterImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getDoubleValueConverter()
     * @generated
     */
    int DOUBLE_VALUE_CONVERTER = 22;

    /**
     * The number of structural features of the '<em>Double Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_VALUE_CONVERTER_FEATURE_COUNT = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Create Converter</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_VALUE_CONVERTER___CREATE_CONVERTER = VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER;

    /**
     * The number of operations of the '<em>Double Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_VALUE_CONVERTER_OPERATION_COUNT = VALUE_CONVERTER_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanSetValueConverterImpl <em>Boolean Set Value Converter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanSetValueConverterImpl
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getBooleanSetValueConverter()
     * @generated
     */
    int BOOLEAN_SET_VALUE_CONVERTER = 23;

    /**
     * The feature id for the '<em><b>True Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER__TRUE_VALUES = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>False Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER__FALSE_VALUES = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Otherwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER__OTHERWISE = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER__IGNORE_CASE = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Boolean Set Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER_FEATURE_COUNT = VALUE_CONVERTER_DEFINITION_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Create Converter</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER___CREATE_CONVERTER = VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER;

    /**
     * The number of operations of the '<em>Boolean Set Value Converter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_SET_VALUE_CONVERTER_OPERATION_COUNT = VALUE_CONVERTER_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType <em>Variant Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getVariantType()
     * @generated
     */
    int VARIANT_TYPE = 24;

    /**
     * The meta object id for the '<em>Input</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.base.extractor.input.Input
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getInput()
     * @generated
     */
    int INPUT = 25;

    /**
     * The meta object id for the '<em>Creation Context</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.da.server.component.parser.factory.CreationContext
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getCreationContext()
     * @generated
     */
    int CREATION_CONTEXT = 26;

    /**
     * The meta object id for the '<em>Extractor</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.base.extractor.extract.Extractor
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getExtractor()
     * @generated
     */
    int EXTRACTOR = 27;

    /**
     * The meta object id for the '<em>Pattern</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.regex.Pattern
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 28;

    /**
     * The meta object id for the '<em>Transformer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.base.extractor.transform.Transformer
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getTransformer()
     * @generated
     */
    int TRANSFORMER = 29;

    /**
     * The meta object id for the '<em>Value Converter</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.base.extractor.convert.ValueConverter
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueConverter()
     * @generated
     */
    int VALUE_CONVERTER = 30;

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Component
     * @generated
     */
    EClass getComponent ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getId()
     * @see #getComponent()
     * @generated
     */
    EAttribute getComponent_Id ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getInput()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Input ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getExtractors <em>Extractors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extractors</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Component#getExtractors()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Extractors ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition <em>Input Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Definition</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition
     * @generated
     */
    EClass getInputDefinition ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition#getTransformers <em>Transformers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transformers</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition#getTransformers()
     * @see #getInputDefinition()
     * @generated
     */
    EReference getInputDefinition_Transformers ();

    /**
     * Returns the meta object for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition#createInput(org.eclipse.scada.da.server.component.parser.factory.CreationContext) <em>Create Input</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Input</em>' operation.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition#createInput(org.eclipse.scada.da.server.component.parser.factory.CreationContext)
     * @generated
     */
    EOperation getInputDefinition__CreateInput__CreationContext ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.FileInput <em>File Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.FileInput
     * @generated
     */
    EClass getFileInput ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.FileInput#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.FileInput#getFileName()
     * @see #getFileInput()
     * @generated
     */
    EAttribute getFileInput_FileName ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition <em>Extractor Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extractor Definition</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition
     * @generated
     */
    EClass getExtractorDefinition ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition#getPrefix()
     * @see #getExtractorDefinition()
     * @generated
     */
    EAttribute getExtractorDefinition_Prefix ();

    /**
     * Returns the meta object for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition#createExtractor(org.eclipse.scada.da.server.component.parser.factory.CreationContext) <em>Create Extractor</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Extractor</em>' operation.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition#createExtractor(org.eclipse.scada.da.server.component.parser.factory.CreationContext)
     * @generated
     */
    EOperation getExtractorDefinition__CreateExtractor__CreationContext ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText <em>Plain Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plain Text</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText
     * @generated
     */
    EClass getPlainText ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText#isTrim <em>Trim</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trim</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText#isTrim()
     * @see #getPlainText()
     * @generated
     */
    EAttribute getPlainText_Trim ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText#getValueConverter <em>Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.PlainText#getValueConverter()
     * @see #getPlainText()
     * @generated
     */
    EReference getPlainText_ValueConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractPeriodInput <em>Abstract Period Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Period Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractPeriodInput
     * @generated
     */
    EClass getAbstractPeriodInput ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractPeriodInput#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractPeriodInput#getPeriod()
     * @see #getAbstractPeriodInput()
     * @generated
     */
    EAttribute getAbstractPeriodInput_Period ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput <em>Url Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Url Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput
     * @generated
     */
    EClass getUrlInput ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#getUrl()
     * @see #getUrlInput()
     * @generated
     */
    EAttribute getUrlInput_Url ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#isProbeCharacterSet <em>Probe Character Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Probe Character Set</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#isProbeCharacterSet()
     * @see #getUrlInput()
     * @generated
     */
    EAttribute getUrlInput_ProbeCharacterSet ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.UrlInput#getCharset()
     * @see #getUrlInput()
     * @generated
     */
    EAttribute getUrlInput_Charset ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern <em>Single Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Pattern</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern
     * @generated
     */
    EClass getSinglePattern ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#getPattern()
     * @see #getSinglePattern()
     * @generated
     */
    EAttribute getSinglePattern_Pattern ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#isFullMatch <em>Full Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full Match</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#isFullMatch()
     * @see #getSinglePattern()
     * @generated
     */
    EAttribute getSinglePattern_FullMatch ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SinglePattern#getValue()
     * @see #getSinglePattern()
     * @generated
     */
    EReference getSinglePattern_Value ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor <em>Value Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Descriptor</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor
     * @generated
     */
    EClass getValueDescriptor ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor#getPrimaryValue <em>Primary Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Primary Value</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor#getPrimaryValue()
     * @see #getValueDescriptor()
     * @generated
     */
    EReference getValueDescriptor_PrimaryValue ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueDescriptor#getAttributes()
     * @see #getValueDescriptor()
     * @generated
     */
    EReference getValueDescriptor_Attributes ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Field <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Field
     * @generated
     */
    EClass getField ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.Field#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.Field#getType()
     * @see #getField()
     * @generated
     */
    EAttribute getField_Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue <em>Attribute Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Value</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue
     * @generated
     */
    EClass getAttributeValue ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue#getName()
     * @see #getAttributeValue()
     * @generated
     */
    EAttribute getAttributeValue_Name ();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Field</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AttributeValue#getField()
     * @see #getAttributeValue()
     * @generated
     */
    EReference getAttributeValue_Field ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MainGroupField <em>Main Group Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Main Group Field</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MainGroupField
     * @generated
     */
    EClass getMainGroupField ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.StringGroupField <em>String Group Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Group Field</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.StringGroupField
     * @generated
     */
    EClass getStringGroupField ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.StringGroupField#getGroupName <em>Group Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Name</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.StringGroupField#getGroupName()
     * @see #getStringGroupField()
     * @generated
     */
    EAttribute getStringGroupField_GroupName ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.NumericGroupField <em>Numeric Group Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Group Field</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.NumericGroupField
     * @generated
     */
    EClass getNumericGroupField ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.NumericGroupField#getGroupNumber <em>Group Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Number</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.NumericGroupField#getGroupNumber()
     * @see #getNumericGroupField()
     * @generated
     */
    EAttribute getNumericGroupField_GroupNumber ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable <em>Split Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Split Table</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable
     * @generated
     */
    EClass getSplitTable ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getLineSeparatorPattern <em>Line Separator Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Separator Pattern</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getLineSeparatorPattern()
     * @see #getSplitTable()
     * @generated
     */
    EAttribute getSplitTable_LineSeparatorPattern ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getFieldSeparatorPattern <em>Field Separator Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Separator Pattern</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getFieldSeparatorPattern()
     * @see #getSplitTable()
     * @generated
     */
    EAttribute getSplitTable_FieldSeparatorPattern ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getIdColumn <em>Id Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Column</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getIdColumn()
     * @see #getSplitTable()
     * @generated
     */
    EAttribute getSplitTable_IdColumn ();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getFields <em>Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Fields</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getFields()
     * @see #getSplitTable()
     * @generated
     */
    EAttribute getSplitTable_Fields ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getValueConverter <em>Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.SplitTable#getValueConverter()
     * @see #getSplitTable()
     * @generated
     */
    EReference getSplitTable_ValueConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition <em>Transformer Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transformer Definition</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition
     * @generated
     */
    EClass getTransformerDefinition ();

    /**
     * Returns the meta object for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition#createTransformer(org.eclipse.scada.da.server.component.parser.factory.CreationContext) <em>Create Transformer</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Transformer</em>' operation.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition#createTransformer(org.eclipse.scada.da.server.component.parser.factory.CreationContext)
     * @generated
     */
    EOperation getTransformerDefinition__CreateTransformer__CreationContext ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.StringTransformer <em>String Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Transformer</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.StringTransformer
     * @generated
     */
    EClass getStringTransformer ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.StringTransformer#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.StringTransformer#getCharset()
     * @see #getStringTransformer()
     * @generated
     */
    EAttribute getStringTransformer_Charset ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput <em>Mqtt Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mqtt Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput
     * @generated
     */
    EClass getMqttInput ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getServerUri <em>Server Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Uri</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getServerUri()
     * @see #getMqttInput()
     * @generated
     */
    EAttribute getMqttInput_ServerUri ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getClientId <em>Client Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client Id</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getClientId()
     * @see #getMqttInput()
     * @generated
     */
    EAttribute getMqttInput_ClientId ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getTopic <em>Topic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Topic</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getTopic()
     * @see #getMqttInput()
     * @generated
     */
    EAttribute getMqttInput_Topic ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getQos <em>Qos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qos</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.MqttInput#getQos()
     * @see #getMqttInput()
     * @generated
     */
    EAttribute getMqttInput_Qos ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractInput <em>Abstract Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Input</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.AbstractInput
     * @generated
     */
    EClass getAbstractInput ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition <em>Value Converter Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Converter Definition</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition
     * @generated
     */
    EClass getValueConverterDefinition ();

    /**
     * Returns the meta object for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition#createConverter() <em>Create Converter</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Converter</em>' operation.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition#createConverter()
     * @generated
     */
    EOperation getValueConverterDefinition__CreateConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanValueConverter <em>Boolean Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanValueConverter
     * @generated
     */
    EClass getBooleanValueConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.DefaultValueConverter <em>Default Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.DefaultValueConverter
     * @generated
     */
    EClass getDefaultValueConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.DoubleValueConverter <em>Double Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Double Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.DoubleValueConverter
     * @generated
     */
    EClass getDoubleValueConverter ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter <em>Boolean Set Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Set Value Converter</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter
     * @generated
     */
    EClass getBooleanSetValueConverter ();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getTrueValues <em>True Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>True Values</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getTrueValues()
     * @see #getBooleanSetValueConverter()
     * @generated
     */
    EAttribute getBooleanSetValueConverter_TrueValues ();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getFalseValues <em>False Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>False Values</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getFalseValues()
     * @see #getBooleanSetValueConverter()
     * @generated
     */
    EAttribute getBooleanSetValueConverter_FalseValues ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getOtherwise <em>Otherwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Otherwise</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#getOtherwise()
     * @see #getBooleanSetValueConverter()
     * @generated
     */
    EAttribute getBooleanSetValueConverter_Otherwise ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#isIgnoreCase <em>Ignore Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ignore Case</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.BooleanSetValueConverter#isIgnoreCase()
     * @see #getBooleanSetValueConverter()
     * @generated
     */
    EAttribute getBooleanSetValueConverter_IgnoreCase ();

    /**
     * Returns the meta object for enum '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType <em>Variant Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Variant Type</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType
     * @generated
     */
    EEnum getVariantType ();

    /**
     * Returns the meta object for data type '{@link org.eclipse.scada.base.extractor.input.Input <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Input</em>'.
     * @see org.eclipse.scada.base.extractor.input.Input
     * @model instanceClass="org.eclipse.scada.base.extractor.input.Input" serializeable="false"
     * @generated
     */
    EDataType getInput ();

    /**
     * Returns the meta object for data type '{@link org.eclipse.scada.da.server.component.parser.factory.CreationContext <em>Creation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Creation Context</em>'.
     * @see org.eclipse.scada.da.server.component.parser.factory.CreationContext
     * @model instanceClass="org.eclipse.scada.da.server.component.parser.factory.CreationContext" serializeable="false"
     * @generated
     */
    EDataType getCreationContext ();

    /**
     * Returns the meta object for data type '{@link org.eclipse.scada.base.extractor.extract.Extractor <em>Extractor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Extractor</em>'.
     * @see org.eclipse.scada.base.extractor.extract.Extractor
     * @model instanceClass="org.eclipse.scada.base.extractor.extract.Extractor" serializeable="false"
     * @generated
     */
    EDataType getExtractor ();

    /**
     * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pattern</em>'.
     * @see java.util.regex.Pattern
     * @model instanceClass="java.util.regex.Pattern"
     * @generated
     */
    EDataType getPattern ();

    /**
     * Returns the meta object for data type '{@link org.eclipse.scada.base.extractor.transform.Transformer <em>Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Transformer</em>'.
     * @see org.eclipse.scada.base.extractor.transform.Transformer
     * @model instanceClass="org.eclipse.scada.base.extractor.transform.Transformer" serializeable="false"
     * @generated
     */
    EDataType getTransformer ();

    /**
     * Returns the meta object for data type '{@link org.eclipse.scada.base.extractor.convert.ValueConverter <em>Value Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Value Converter</em>'.
     * @see org.eclipse.scada.base.extractor.convert.ValueConverter
     * @model instanceClass="org.eclipse.scada.base.extractor.convert.ValueConverter" serializeable="false"
     * @generated
     */
    EDataType getValueConverter ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ParserFactory getParserFactory ();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ComponentImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent ();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id ();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__INPUT = eINSTANCE.getComponent_Input ();

        /**
         * The meta object literal for the '<em><b>Extractors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__EXTRACTORS = eINSTANCE.getComponent_Extractors ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition <em>Input Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.InputDefinition
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getInputDefinition()
         * @generated
         */
        EClass INPUT_DEFINITION = eINSTANCE.getInputDefinition ();

        /**
         * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_DEFINITION__TRANSFORMERS = eINSTANCE.getInputDefinition_Transformers ();

        /**
         * The meta object literal for the '<em><b>Create Input</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation INPUT_DEFINITION___CREATE_INPUT__CREATIONCONTEXT = eINSTANCE.getInputDefinition__CreateInput__CreationContext ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FileInputImpl <em>File Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FileInputImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getFileInput()
         * @generated
         */
        EClass FILE_INPUT = eINSTANCE.getFileInput ();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_INPUT__FILE_NAME = eINSTANCE.getFileInput_FileName ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition <em>Extractor Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ExtractorDefinition
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getExtractorDefinition()
         * @generated
         */
        EClass EXTRACTOR_DEFINITION = eINSTANCE.getExtractorDefinition ();

        /**
         * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTRACTOR_DEFINITION__PREFIX = eINSTANCE.getExtractorDefinition_Prefix ();

        /**
         * The meta object literal for the '<em><b>Create Extractor</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTRACTOR_DEFINITION___CREATE_EXTRACTOR__CREATIONCONTEXT = eINSTANCE.getExtractorDefinition__CreateExtractor__CreationContext ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.PlainTextImpl <em>Plain Text</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.PlainTextImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getPlainText()
         * @generated
         */
        EClass PLAIN_TEXT = eINSTANCE.getPlainText ();

        /**
         * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLAIN_TEXT__TRIM = eINSTANCE.getPlainText_Trim ();

        /**
         * The meta object literal for the '<em><b>Value Converter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLAIN_TEXT__VALUE_CONVERTER = eINSTANCE.getPlainText_ValueConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractPeriodInputImpl <em>Abstract Period Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractPeriodInputImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAbstractPeriodInput()
         * @generated
         */
        EClass ABSTRACT_PERIOD_INPUT = eINSTANCE.getAbstractPeriodInput ();

        /**
         * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_PERIOD_INPUT__PERIOD = eINSTANCE.getAbstractPeriodInput_Period ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.UrlInputImpl <em>Url Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.UrlInputImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getUrlInput()
         * @generated
         */
        EClass URL_INPUT = eINSTANCE.getUrlInput ();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute URL_INPUT__URL = eINSTANCE.getUrlInput_Url ();

        /**
         * The meta object literal for the '<em><b>Probe Character Set</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute URL_INPUT__PROBE_CHARACTER_SET = eINSTANCE.getUrlInput_ProbeCharacterSet ();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute URL_INPUT__CHARSET = eINSTANCE.getUrlInput_Charset ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SinglePatternImpl <em>Single Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SinglePatternImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getSinglePattern()
         * @generated
         */
        EClass SINGLE_PATTERN = eINSTANCE.getSinglePattern ();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SINGLE_PATTERN__PATTERN = eINSTANCE.getSinglePattern_Pattern ();

        /**
         * The meta object literal for the '<em><b>Full Match</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SINGLE_PATTERN__FULL_MATCH = eINSTANCE.getSinglePattern_FullMatch ();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_PATTERN__VALUE = eINSTANCE.getSinglePattern_Value ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ValueDescriptorImpl <em>Value Descriptor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ValueDescriptorImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueDescriptor()
         * @generated
         */
        EClass VALUE_DESCRIPTOR = eINSTANCE.getValueDescriptor ();

        /**
         * The meta object literal for the '<em><b>Primary Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DESCRIPTOR__PRIMARY_VALUE = eINSTANCE.getValueDescriptor_PrimaryValue ();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DESCRIPTOR__ATTRIBUTES = eINSTANCE.getValueDescriptor_Attributes ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FieldImpl <em>Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.FieldImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getField()
         * @generated
         */
        EClass FIELD = eINSTANCE.getField ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__TYPE = eINSTANCE.getField_Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AttributeValueImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAttributeValue()
         * @generated
         */
        EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_VALUE__NAME = eINSTANCE.getAttributeValue_Name ();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_VALUE__FIELD = eINSTANCE.getAttributeValue_Field ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MainGroupFieldImpl <em>Main Group Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MainGroupFieldImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getMainGroupField()
         * @generated
         */
        EClass MAIN_GROUP_FIELD = eINSTANCE.getMainGroupField ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringGroupFieldImpl <em>String Group Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringGroupFieldImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getStringGroupField()
         * @generated
         */
        EClass STRING_GROUP_FIELD = eINSTANCE.getStringGroupField ();

        /**
         * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_GROUP_FIELD__GROUP_NAME = eINSTANCE.getStringGroupField_GroupName ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.NumericGroupFieldImpl <em>Numeric Group Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.NumericGroupFieldImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getNumericGroupField()
         * @generated
         */
        EClass NUMERIC_GROUP_FIELD = eINSTANCE.getNumericGroupField ();

        /**
         * The meta object literal for the '<em><b>Group Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_GROUP_FIELD__GROUP_NUMBER = eINSTANCE.getNumericGroupField_GroupNumber ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SplitTableImpl <em>Split Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.SplitTableImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getSplitTable()
         * @generated
         */
        EClass SPLIT_TABLE = eINSTANCE.getSplitTable ();

        /**
         * The meta object literal for the '<em><b>Line Separator Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPLIT_TABLE__LINE_SEPARATOR_PATTERN = eINSTANCE.getSplitTable_LineSeparatorPattern ();

        /**
         * The meta object literal for the '<em><b>Field Separator Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPLIT_TABLE__FIELD_SEPARATOR_PATTERN = eINSTANCE.getSplitTable_FieldSeparatorPattern ();

        /**
         * The meta object literal for the '<em><b>Id Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPLIT_TABLE__ID_COLUMN = eINSTANCE.getSplitTable_IdColumn ();

        /**
         * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPLIT_TABLE__FIELDS = eINSTANCE.getSplitTable_Fields ();

        /**
         * The meta object literal for the '<em><b>Value Converter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPLIT_TABLE__VALUE_CONVERTER = eINSTANCE.getSplitTable_ValueConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition <em>Transformer Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.TransformerDefinition
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getTransformerDefinition()
         * @generated
         */
        EClass TRANSFORMER_DEFINITION = eINSTANCE.getTransformerDefinition ();

        /**
         * The meta object literal for the '<em><b>Create Transformer</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TRANSFORMER_DEFINITION___CREATE_TRANSFORMER__CREATIONCONTEXT = eINSTANCE.getTransformerDefinition__CreateTransformer__CreationContext ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringTransformerImpl <em>String Transformer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.StringTransformerImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getStringTransformer()
         * @generated
         */
        EClass STRING_TRANSFORMER = eINSTANCE.getStringTransformer ();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TRANSFORMER__CHARSET = eINSTANCE.getStringTransformer_Charset ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MqttInputImpl <em>Mqtt Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.MqttInputImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getMqttInput()
         * @generated
         */
        EClass MQTT_INPUT = eINSTANCE.getMqttInput ();

        /**
         * The meta object literal for the '<em><b>Server Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MQTT_INPUT__SERVER_URI = eINSTANCE.getMqttInput_ServerUri ();

        /**
         * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MQTT_INPUT__CLIENT_ID = eINSTANCE.getMqttInput_ClientId ();

        /**
         * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MQTT_INPUT__TOPIC = eINSTANCE.getMqttInput_Topic ();

        /**
         * The meta object literal for the '<em><b>Qos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MQTT_INPUT__QOS = eINSTANCE.getMqttInput_Qos ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractInputImpl <em>Abstract Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.AbstractInputImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getAbstractInput()
         * @generated
         */
        EClass ABSTRACT_INPUT = eINSTANCE.getAbstractInput ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition <em>Value Converter Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.ValueConverterDefinition
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueConverterDefinition()
         * @generated
         */
        EClass VALUE_CONVERTER_DEFINITION = eINSTANCE.getValueConverterDefinition ();

        /**
         * The meta object literal for the '<em><b>Create Converter</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation VALUE_CONVERTER_DEFINITION___CREATE_CONVERTER = eINSTANCE.getValueConverterDefinition__CreateConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanValueConverterImpl <em>Boolean Value Converter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanValueConverterImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getBooleanValueConverter()
         * @generated
         */
        EClass BOOLEAN_VALUE_CONVERTER = eINSTANCE.getBooleanValueConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DefaultValueConverterImpl <em>Default Value Converter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DefaultValueConverterImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getDefaultValueConverter()
         * @generated
         */
        EClass DEFAULT_VALUE_CONVERTER = eINSTANCE.getDefaultValueConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DoubleValueConverterImpl <em>Double Value Converter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.DoubleValueConverterImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getDoubleValueConverter()
         * @generated
         */
        EClass DOUBLE_VALUE_CONVERTER = eINSTANCE.getDoubleValueConverter ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanSetValueConverterImpl <em>Boolean Set Value Converter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.BooleanSetValueConverterImpl
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getBooleanSetValueConverter()
         * @generated
         */
        EClass BOOLEAN_SET_VALUE_CONVERTER = eINSTANCE.getBooleanSetValueConverter ();

        /**
         * The meta object literal for the '<em><b>True Values</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_SET_VALUE_CONVERTER__TRUE_VALUES = eINSTANCE.getBooleanSetValueConverter_TrueValues ();

        /**
         * The meta object literal for the '<em><b>False Values</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_SET_VALUE_CONVERTER__FALSE_VALUES = eINSTANCE.getBooleanSetValueConverter_FalseValues ();

        /**
         * The meta object literal for the '<em><b>Otherwise</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_SET_VALUE_CONVERTER__OTHERWISE = eINSTANCE.getBooleanSetValueConverter_Otherwise ();

        /**
         * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_SET_VALUE_CONVERTER__IGNORE_CASE = eINSTANCE.getBooleanSetValueConverter_IgnoreCase ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType <em>Variant Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.VariantType
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getVariantType()
         * @generated
         */
        EEnum VARIANT_TYPE = eINSTANCE.getVariantType ();

        /**
         * The meta object literal for the '<em>Input</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.base.extractor.input.Input
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getInput()
         * @generated
         */
        EDataType INPUT = eINSTANCE.getInput ();

        /**
         * The meta object literal for the '<em>Creation Context</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.da.server.component.parser.factory.CreationContext
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getCreationContext()
         * @generated
         */
        EDataType CREATION_CONTEXT = eINSTANCE.getCreationContext ();

        /**
         * The meta object literal for the '<em>Extractor</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.base.extractor.extract.Extractor
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getExtractor()
         * @generated
         */
        EDataType EXTRACTOR = eINSTANCE.getExtractor ();

        /**
         * The meta object literal for the '<em>Pattern</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.regex.Pattern
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getPattern()
         * @generated
         */
        EDataType PATTERN = eINSTANCE.getPattern ();

        /**
         * The meta object literal for the '<em>Transformer</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.base.extractor.transform.Transformer
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getTransformer()
         * @generated
         */
        EDataType TRANSFORMER = eINSTANCE.getTransformer ();

        /**
         * The meta object literal for the '<em>Value Converter</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.base.extractor.convert.ValueConverter
         * @see org.eclipse.scada.da.server.component.parser.factory.configuration.impl.ParserPackageImpl#getValueConverter()
         * @generated
         */
        EDataType VALUE_CONVERTER = eINSTANCE.getValueConverter ();

    }

} //ParserPackage
