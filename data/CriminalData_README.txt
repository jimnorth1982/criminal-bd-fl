File Name:  README.TXT
Date Created:  09/08/2014
Date Updated:  07/27/2015
Agency:  Hillsborough County Clerk of the Circuit Court


This "readme.txt" file describes the format of the "FF1020CF.WP" and the "FF1020CM.WP"
files that are available for download at this https site.

Agency : Hillsborough County Clerk of the Circuit Court

GENERAL DESCRIPTION

The Circuit Criminal Name Index file, FF1020CF.WP, and the County Criminal
Name Index file, FF1020CM.WP, provides an index of defendant names for all
Circuit Criminal cases and County Criminal cases (both active and disposed) which are
currently stored online in the Criminal Courts database.

The listing order for defendants is by year of file date and then alphabetical defendant last,
first name order.

These files contain page headings, column headings, carriage control characters, etc.

Every record on the Circuit/County Criminal Name Index file is 174 characters
in length.  The first four records are report headings, then two records of column
headings, followed by data records.

Each data record contains the following items:  defendant name/alias, party ID, party code, defendant case
number, division, sex, race, date of birth, date of filing, number of count, level of
count, charge description, disposition code if available, and disposition date if available.

Data purged from the database is also purged from the Circuit/County Criminal Name Index files.


DATA ELEMENT DESCRIPTIONS

Data Element Name/Column Name  	Data Element Description
-----------------		------------------------
Defendant Name Type		The type of defendant name:
				C - Current Known Name
				A - Alias

Defendant Name			The name or alias of a defendant in LASTNAME, FIRSTNAME MI
	                	SUFFIX format or the name of a business.

PID				This field defines the identification number used
				to access person on-line.

Party Code/DEF			A unique alphanumeric identifier for each defendant
				on a case.  The first character will be a "D" and a
				numeric value will follow (e.g., "D001", "D002", etc.).

Defendant Case Number/CASE NO.	The sequential number assigned to the case that,when
				paired with the year of filing and court location,
				forms a unique case identifier (e.g., "01-CF-012345-A",
				"01-CM-012345-A", etc.).

Division/D			The letter indicator showing the division to which the
                                case is assigned.  Each Judge is assigned to preside
                                over a specific letter division.

Sex/S				The sex of the person.  Valid values are M - Male,
				F - Female, N - Unknown.

Race/R				The ethnicity associated with a person.
				A	ASIAN
				B	BLACK
				H	NATIVE HAWAIIAN OR OTHER PACIFIC ISLANDER
				I	INDIAN
				M	MULTIRACIAL
				O	OTHER
				S	HISPANIC
				U	UNKNOWN
				W	WHITE

Date of Birth/DOB		The persons date of birth in
				MM/DD/YY format.

Date of Filing/FILED		The month, day and year the case was filed in
				MM/DD/YY format.

Number of Count/CNT NO.		The number assigned to each charge code.

Level of Count/LVL		The level of the charge code.
                                FC	FELONY CAPITAL
                                FL	FELONY LIFE
                                FP	FELONY FIRST DEG PUNISH LIFE
                                FF	FELONY FIRST DEGREE
                                FN	Translates to: F = A matter filed in Felony court,
                                        N = Not applicable as it is not a State of Florida
                                        criminal charge. Primarily, FN matters are files
                                        opened for prisoners in the local jail on Federal
                                        matters.
                                FS	FELONY SECOND DEGREE
                                FT	FELONY THIRD DEGREE
                                MF 	MISDEMEANOR FIRST DEGREE
                                MS	MISDEMEANOR SECOND DEGREE
                                IN 	INFRACTION
                                CN	COUNTY ORDINANCE
                                LN	MUNICIPAL (City) ORDINANCE
                                F	FELONY
                                M	MISDEMEANOR
				NA	NOT APPLICABLE





Charge Description/(same)     	The description of the charge code.

Charge Disposition Code		The disposition code is displayed only if a disposition has been entered on the
				charge. If this field is blank there is	no disposition code entered.
				ACCD	AFTER COURT CALENDAR (CLOSED)
				ACQT	JT - NOT GUILTY VERDICT
				ADJD	NT - ADJUDICATED DELINQUENT
				ADJG	NT - ADJUDGED GUILTY
				ADJW	JT - ADJUDICATION  WITHHELD
				ADNG	JUDGMENT NOT GUILTY
				AMDS	ADMINISTRATIVELY DISMISSED
				AMNOL	ADMINISTRATIVELY NOLLE PROSSED
				APDIS	APPEAL DISMISSED
				AWPC	ADJUDICATION WITHHELD (PLEA NC & PROOF OF COMPLIANCE)
				AWSE	ADJUDICATION WITHHELD BY CLERK (SCHOOL/TOLL ELECTION)
				CBOES	CONVBOND ESTREATED/NO OTHER CT ACT
				CDSCH	CONVDISCHARGED
				CHGVEN	CHANGE OF VENUE
				CONS	CONSOLIDATED CASE
				DCIE	DATASHARE CREATED IN ERROR
				DFIN	DEFENDANT INCOMPETENT
				DISH	DEF INCOMPETENT STATE HOSPITAL
				DISMCLK	DISMISSED BY CLERK - VALID PROOF PROVIDED
				EXT	EXTRADITION
				FASJF	ACKNOW OF SATISFACTION OF JUDGMENT
				FELNPTI	NT - NOLLE PROSSED FOR PURPOSE OF PRE TRIAL DIVERSION
				INCRC	INCOMPETENT PROCEED RESOLUTION CONTRACT
				INVI	IN VIOLATION
				IPCRC	INCOMPETENT TO PROCEED RESOLUTION CONTRACT
				IPRCD	INCOMPETENCY RESOLUTION CONTRACT DISMISSED
				JDFF	JUVENILE DIRECT FILE FELONY
				JDSMW	JUVENILE DISMISSAL OF WALKER PLAN
				JDST	DISMISSED SPEEDY TRIAL
				JFIN	JUVENILE FOUND INCOMPETENT TO PROCEED
				JTADJG	JT - ADJUDICATED GUILTY
				JTAQRI	JT - ACQUITTED BY REASON OF INSANITY
				JTAWD	JT - ADJUDICATION WITHHELD (DWLS)
				JTDA	JT - DECLINE TO ADJUDICATE
				JTDISM	JT - DISMISSED
				JTJOA	JT - JUDGMENT OF ACQUITTAL/NOT GUILTY
				JTNOLP	JT - NOLLE PROSSED
				JUGV	JT - GUILTY VERDICT
				JVDSMR	JUVENILE DISMISSAL OF REHAB PLAN
				JVNPTF	JUVENILE NO PETITION FILED
				JVREPL	JUVENILE ENTERED REHAB PLAN
				JWALK	JUVENILE ENTERED INTO WALKER PLAN
				MANAF	MANDATE AFFIRMED
				MANRR	MANDATE REVERSED AND REMANDED
				MISDA	MISDEMEANOR INTERVENTION AGREEMENT
				NGRI	NOT GUILTY BY REASON INSANITY
				NJADW	NJT - ADJUDICATION OF DELINQUENCY WITHHELD
				NJAW	NJT - ADJUDICATION WITHHELD
				NJTAD	NJT - ADJUDICATED DELINQUENT
				NJTADJG	NJT - ADJUDICATED GUILTY
				NJTAQRI	NJT - ACQUITTED BY REASON OF INSANITY
				NJTAWD	NJT - ADJUDICATION WITHHELD (DWLS)
				NJTDA	NJT - DECLINE TO ADJUDICATE
				NJTDISM	NJT - DISMISSED
				NJTJOA	NJT - JUDGMENT OF ACQUITTAL/NOT GUILTY
				NJTNOLP	NJT - NOLLE PROSSED
				NJTRG	NJT - GUILTY VERDICT
				NOINV	NOT IN VIOLATION
				NONE	NONE
				NONEVB	NONE VERDICT B
				NTADW	NT - ADJUDICATION DELINQUENT WITHHELD
				NTAW	NT - ADJUDICATION WITHHELD
				NTDA	NT - DECLINE TO ADJUDICATE
				NTDISM	NT - DISMISSED
				NTJOA	NT - JUDGMENT OF ACQUITTAL/NOT GUILTY
				NTLOR	NT - LETTER OF RELEASE
				NTNINF	NT - NO INFORMATION FILED
				NTNOLP	NT - NOLLE PROSSED
				NTNOTP	NT - NOTICE OF TERMINATION OF PROSECUTION
				NTOTH	NT - OTHER
				OCTR	OTHER COURT TRANSFER
				PFCP	PAID FINE OR CIVIL PENALTY
				PIPTI	PRE INFORMATION PTI AGREEMENT
				PYMT	GUILTY-PAID FINE
				REDU	REDUCED TO COUNTY COURT
				SCFD	STATE CLOSED FILE DIVERSION
				SDEP	STIPULATED DEPORTATION
				UPTF	UPGRADE TO FELONY
				WHDWLS	NT - ADJUDICATION WITHHELD (DWLS)


Disposed			The date of the dispositon

RECORD LAYOUT for FF1020CF.WP and FF1020CM.WP*

 Field	 	 Data
Position	Length	Type		Field Name
----------      ------  ------------    ----------
   1 -  1   1   Alphanumeric    NameType
   2 -  2   1   Alphanumeric    Blank
   3 - 37   35	Alphanumeric    Name
  38 - 38   1	Alphanumeric    Blank1
  39 - 48   10	Alphanumeric    PID
  49 - 49   1	Alphanumeric	Blank2
  50 - 53   4	Alphanumeric	Party Code
  54 - 54   1	Alphanumeric	Blank3
  55 - 69   15	Alphanumeric	Defendant Case Number
  70 - 70   1	Alphanumeric	Blank4
  71 - 73   3	Alphanumeric	Division
  74 - 76   3	Alphanumeric	Blank5
  77 - 77   1	Alphanumeric	Sex
  78 - 78   1	Alphanumeric	Blank6
  79 - 79   1	Alphanumeric	Race
  80 - 81   2	Alphanumeric	Blank7
  82 - 89   8	Alphanumeric	Date of Birth
  90 - 93   4	Alphanumeric	Blank8
  94 - 101  8	Alphanumeric	Date of Filing
 102 - 103  2	Alphanumeric	Blank9
 104 - 106  3	Numeric		    Number of Count
 107 - 107  1	Alphanumeric	Blank10
 108 - 110  3	Alphanumeric	Level of Count
 111 - 112  2   Alphanumeric	Blank11
 113 - 158  46  Alphanumeric	Charge Description
 159 - 160  2   Alphanumeric   	Blank12
 161 - 170  10  Alphanumeric    Disposition Code
 171 - 171  1   Alphanumeric    Blank13
 172 - 179  8   Alphanumeric    Disposition Date


*  This record layout is subject to change without notification.