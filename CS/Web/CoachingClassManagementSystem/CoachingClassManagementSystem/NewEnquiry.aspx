<%@ Page Title="NewEnquiry" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="NewEnquiry.aspx.cs" Inherits="CoachingClassManagementSystem.NewEnquiry" %>
<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <br />
    <div class="form-group">
        <asp:Label runat="server" for="TxtEnquiryId">Enquiry Id</asp:Label>
        <asp:TextBox runat="server" class="form-control" ID="TxtEnquiryId"></asp:TextBox>
    </div>
    <div class="form-group">
        <asp:Label runat="server">Enquiry Name</asp:Label>
        <asp:TextBox runat="server"  class="form-control" ID ="TxtEnquiryName"></asp:TextBox>
    </div>
    <label runat="server" id="LblConfirm"></label>
    <asp:Button runat="server" ID="BtnSubmit" Text="Submit" class="btn btn-primary" OnClick="BtnSubmit_Click"/>
</asp:Content>
