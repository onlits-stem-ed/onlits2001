Public Class Addition
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub BtnAdd_Click(sender As Object, e As EventArgs) Handles BtnAdd.Click
        Dim a, b, c As Integer
        a = TxtAugend.Text
        b = TxtAddend.Text
        c = a + b
        TxtSum.Text = c
    End Sub
End Class