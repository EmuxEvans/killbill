/* 
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ning.billing.payment.api;

import java.math.BigDecimal;
import java.util.UUID;
import com.ning.billing.util.entity.Entity;
import org.joda.time.DateTime;
import com.ning.billing.util.bus.BusEvent;


public interface PaymentInfoEvent extends Entity, BusEvent {

    public UUID getAccountId();
    
    public UUID getInvoiceId();

    public BigDecimal getAmount();

    public String getBankIdentificationNumber();

    public DateTime getEffectiveDate();

    public String getPaymentNumber();

    public String getPaymentMethod();

    public String getCardType();

    public String getCardCountry();

    public String getReferenceId();

    public String getPaymentMethodId();

    public BigDecimal getRefundAmount();

    public String getStatus();

    public String getType();
    
    public DateTime getCreatedDate();
    
    public DateTime getUpdatedDate();
}
