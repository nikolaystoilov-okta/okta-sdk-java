/*!
 * Copyright (c) 2015-2017, Okta, Inc. and/or its affiliates. All rights reserved.
 * The Okta software accompanied by this notice is provided pursuant to the Apache License, Version 2.0 (the "License.")
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.okta.sdk.models.factors;

import com.okta.sdk.framework.ApiObject;

public class FactorProfile extends ApiObject {

    /**
     * Unique key for question.
     */
    private String question;

    /**
     * Display text for question.
     */
    private String questionText;

    /**
     * Answer to the question.
     */
    private String answer;

    /**
     * Phone number of mobile device.
     */
    private String phoneNumber;

    /**
     * Unique id for the instance.
     */
    private String credentialId;

    /**
     * Returns the question.
     * @return {@link String}
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Sets the question.
     * @param val {@link String}
     */
    public void setQuestion(String val) {
        this.question = val;
    }

    /**
     * Returns the questionText.
     * @return {@link String}
     */
    public String getQuestionText() {
        return this.questionText;
    }

    /**
     * Sets the questionText.
     * @param val {@link String}
     */
    public void setQuestionText(String val) {
        this.questionText = val;
    }

    /**
     * Returns the answer.
     * @return {@link String}
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * Sets the answer.
     * @param val {@link String}
     */
    public void setAnswer(String val) {
        this.answer = val;
    }

    /**
     * Returns the phoneNumber.
     * @return {@link String}
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Sets the phoneNumber.
     * @param val {@link String}
     */
    public void setPhoneNumber(String val) {
        this.phoneNumber = val;
    }

    /**
     * Returns the credentialId.
     * @return {@link String}
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * Sets the credentialId.
     * @param val {@link String}
     */
    public void setCredentialId(String val) {
        this.credentialId = val;
    }
}
