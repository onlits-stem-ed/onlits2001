Public Class Subtraction
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub BtnSubtract_Click(sender As Object, e As EventArgs) Handles BtnSubtract.Click
        Dim a, b, c As Integer
        a = TxtSubtrahand.Text
        b = TxtMinuend.Text
        c = a - b
        TxtDiffernce.Text = c
    End Sub
End Class